package android.app;

/***
 * Created by laomo on 2016-11-21.
 */
public class FragmentManager {
	public static final int POP_BACK_STACK_INCLUSIVE = 1<<0;

	public FragmentTransaction beginTransaction() {
		throw new RuntimeException("Stub!");
	}

	public boolean executePendingTransactions() {
		throw new RuntimeException("Stub!");
	}

	public void popBackStack() {
		throw new RuntimeException("Stub!");
	}

	public void popBackStack(String name, int flags) {
		throw new RuntimeException("Stub!");
	}

	public int getBackStackEntryCount() {
		throw new RuntimeException("Stub!");
	}

	public BackStackEntry getBackStackEntryAt(int index) {
		throw new RuntimeException("Stub!");
	}

	public Fragment findFragmentById(int id) {
		throw new RuntimeException("Stub!");
	}

	public interface BackStackEntry {
		int getId();

		String getName();
	}
}