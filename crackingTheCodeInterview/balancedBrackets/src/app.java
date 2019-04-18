import java.util.Stack;

public class app {
	public static boolean isBalanced(String expression) {
		if (expression == null) {
			return false;
		}
		char[] charArray = expression.toCharArray();
		Stack<Character> st = new Stack<Character>();
		if (charArray.length % 2 != 0) {
			return false;
		}

		// {, }, (, ), [, and ]
		char braces = '{';
		char parentheses = '(';
		char bracket = '[';
		char braces_close = '}';
		char parentheses_close = ')';
		char bracket_close = ']';

		for (char c : charArray) {
			if (!st.isEmpty()) {
				if (!isClose(c)) {
					st.push(c);
				} else if (st.peek() == braces) {
					if (c == braces_close) {
						st.pop();
					} else {
						return false;
					}
				} else if (st.peek() == parentheses) {
					if (c == parentheses_close) {
						st.pop();
					} else {
						return false;
					}
				} else if (st.peek() == bracket) {
					if (c == bracket_close) {
						st.pop();
					} else {
						return false;
					}
				}

			} else {
				st.push(c);
			}
		}
		if (st.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	private static boolean isClose(char c) {
		char braces_close = '}';
		char parentheses_close = ')';
		char bracket_close = ']';
		if (c == braces_close || c == parentheses_close || c == bracket_close) {
			return true;
		}
		return false;
	}
}
