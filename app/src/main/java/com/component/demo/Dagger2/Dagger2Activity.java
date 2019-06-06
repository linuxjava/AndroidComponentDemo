package com.component.demo.Dagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.component.demo.Dagger2.normal.DaggerMainComponent;
import com.component.demo.Dagger2.normal.MainComponent;
import com.component.demo.Dagger2.normal.MainModule;
import com.component.demo.Dagger2.normal.Person;
import com.component.demo.Dagger2.normal.Person2;
import com.component.demo.Dagger2.params.PersonWithParams;
import com.component.demo.Dagger2.singleton.SingletonPerson;
import com.component.demo.R;

import javax.inject.Inject;

import timber.log.Timber;

public class Dagger2Activity extends AppCompatActivity {
    /**
     * 第一种注入方式：
     * Person2可以可以被修改，所以在其构造函数上直接使用@Inject标记
     */
    @Inject
    Person2 person2;
    /**
     * 第二种注入方式：
     * Person类是一个没有使用@Inject注解其构造函数的类，而且我们也无法加上，可能由于它是一个第三方类，或者其他原因。
     * 那我们想要使用dagger2将其注入到其它类中就需要使用到Module。Module负责提供Person类的实例对象，当Component发现了使用 @Inject注解的Person类属性时，
     * 先去Module中查找，没有的话再去看其构造函数是不是使用@Inject标记了，如果都没有，注入失败
     */
    @Inject
    Person person;

    /**
     * 单例注解测试(下面两个实例指向的是同一个实例)
     */
    @Inject
    SingletonPerson singletonPerson1;
    @Inject
    SingletonPerson singletonPerson2;

    @Inject
    PersonWithParams personWithParams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);

        MainComponent component = DaggerMainComponent.builder()
                .mainModule(new MainModule(this)).build();
        component.inject(this);

        testSingleton();
    }

    /**
     * 测试单例模式
     */
    private void testSingleton() {
        Timber.d("singletonPerson1: " + singletonPerson1.hashCode());
        Timber.d("singletonPerson2: " + singletonPerson2.hashCode());
    }

    public void onDependency(View v){
        startActivity(new Intent(this, DependencyActivity.class));
    }

}
