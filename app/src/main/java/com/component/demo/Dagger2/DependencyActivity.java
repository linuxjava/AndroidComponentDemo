package com.component.demo.Dagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.component.demo.Dagger2.dependency.ActivityComponent;
import com.component.demo.Dagger2.dependency.ActivityModule;
import com.component.demo.Dagger2.dependency.AppComponent;
import com.component.demo.Dagger2.dependency.AppModule;
import com.component.demo.Dagger2.dependency.DaggerActivityComponent;
import com.component.demo.Dagger2.dependency.DaggerAppComponent;
import com.component.demo.Dagger2.dependency.PersonDependency;
import com.component.demo.R;

import javax.inject.Inject;

/**
 * 依赖组件测试类
 */
public class DependencyActivity extends AppCompatActivity {
    @Inject
    PersonDependency personDependency;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_dependency);

        testDependency();
    }

    /**
     * 测试依赖一个组件注入
     */
    private void testDependency(){
        AppComponent appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this)).build();
        ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .appComponent(appComponent)
                .activityModule(new ActivityModule())
                .build();
        activityComponent.inject(this);
    }
}
