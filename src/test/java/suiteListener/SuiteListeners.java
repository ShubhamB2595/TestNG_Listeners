package suiteListener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListeners implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        System.out.println("Suite executed onStart: "  + suite.getName());
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("Suite executed onFinish: "  + suite.getName());
    }
}
