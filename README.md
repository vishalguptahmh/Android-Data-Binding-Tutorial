# Android-Data-Binding-Tutorial
Android Basic Data Binding Tutorial

### Add this code to Grade file: build.gradle(Module:app)
```java

 dataBinding {
        enabled = true
    }

```

#### Example 
```java

android {
    compileSdkVersion 26
    defaultConfig {
        applicationId "com.vishalguptahmh.com.databindingexample"
        minSdkVersion 21
        targetSdkVersion 26
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
    dataBinding {
        enabled = true
    }
}

```


### wrap Layout with layout tags 

#### Example 

```java


<?xml version="1.0" encoding="utf-8"?>
<layout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    >
    <android.support.constraint.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context="com.vishalguptahmh.com.databindingexample.MainActivity">

        <TextView
            android:id="@+id/name"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@{model.name}"
            tools:text="Jolly Gupta"
            android:layout_marginTop="20dp"
            android:layout_marginStart="20dp"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintTop_toTopOf="parent"

            />

    </android.support.constraint.ConstraintLayout>

</layout>

```


## Useablity

```java


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Generate Binding with layout to Java file
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);


        //change value in textview
        binding.name.setText("Vishal Gupta");
            

    }
}

 
 
```
