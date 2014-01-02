package net.framework.sample.ssh2;

public class TestBean {
	public TestBean() {

		String drivers;

		try {
			drivers = (String) java.security.AccessController.doPrivileged(new sun.security.action.GetPropertyAction("jdbc.drivers"));
		} catch (Exception ex) {
			drivers = null;
		}

		System.out.println("init..........."+drivers+"--");
	}

	public void go() {
		System.out.println("go..............");
	}
}
