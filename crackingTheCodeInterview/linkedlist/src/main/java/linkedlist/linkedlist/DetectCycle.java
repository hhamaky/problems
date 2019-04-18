package linkedlist.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class DetectCycle {
	public static void main(String[] args) {
	}

	boolean hasCycle(Node head) {
		if (head == null) {
			return false;
		}

		if (head.next == null) {
			return false;
		}
		int data = head.data;
		Node tmp = head;
		List <Node> nodes = new ArrayList<Node>();
		nodes.add(tmp);
		while (tmp.next != null) {
			if(nodes.contains(tmp.next)){
				return true;
			}else{
                nodes.add(tmp.next);
            }
			
			tmp = tmp.next;
		}
		return false;
	}
}
