package com.michael.exceptiondemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


/**
 * 这个demo显示的是java中的Exception是如何运作的，通过Logcat中的输出，你可以看到java中的异常有几种常见的情况，以及是如何运作的
 * 
 * @author Michael
 * */
public class MainActivity extends Activity {

	private String TAG = "MainActivity";
	private Button btnClick;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnClick = (Button)findViewById(R.id.btn);
        final Person person = new Person();
        
        btnClick.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
//				person.setAge(-1);
				
				try {
					person.setAge(-1);
				} catch (Exception e) {
					// 这里不要让处理异常的地方空着，这样就算捕获到了异常也没有意义了，
					// 如果你认为这个地方可以不做任何处理，至少需要包含一条提示，说明下为什么不做处理。方便以后调试，或者供别人参考
					Log.e(TAG, "You shoud check the value of name before pass it to the method");
					showExceptionTip();//对错误进行处理
					e.printStackTrace();
				}
			}
		});
    }

    /**
     * 对错误进行处理
     * 
     * */
    private void showExceptionTip()
    {
    	Toast.makeText(MainActivity.this, "不能输入负数", Toast.LENGTH_SHORT).show();
    	//You can do something else...
    }
    
}
