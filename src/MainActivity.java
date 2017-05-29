


        import android.app.Activity;
        import android.os.Bundle;
        import android.widget.TextView;

        import java.text.SimpleDateFormat;
        import java.util.Date;

public class MainActivity extends Activity {

    // ����ð��� msec ���� ���Ѵ�.
    long now = System.currentTimeMillis();
    // ����ð��� date ������ �����Ѵ�.
    Date date = new Date(now);
    // �ð��� ��Ÿ�� ������ ���Ѵ� ( yyyy/MM/dd ���� ���·� ���� ���� )
    SimpleDateFormat sdfNow = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    // nowDate ������ ���� �����Ѵ�.
    String formatDate = sdfNow.format(date);

    TextView dateNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateNow = (TextView) findViewById(R.id.dateNow);
        dateNow.setText(formatDate);    // TextView �� ���� �ð� ���ڿ� �Ҵ�
    }
}

