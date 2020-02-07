package Mobile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MobileAppFront {
	

		static List<ContactList> list = new ArrayList<>();

		public MobileAppFront() {
			this.list = new ArrayList<ContactList>();

		}

		public static void main(String[] args) {

			MobileAppFront cal = new MobileAppFront();

			ContactList l = new ContactList("Shilpa", 1234567, "test1@test.com");
			ContactList l1 = new ContactList("Test1", 1234589, "test2@test.com");
			ContactList l2 = new ContactList("Test2", 1234512, "test3@test.com");

			list.add(l);
			list.add(l1);
			list.add(l2);
			int n = list.size();
			System.out.println(n);

			// System.out.println(cal.list.indexOf(l1));

			// System.out.println(list.indexOf(l));
			// System.out.println(list.indexOf(l1));
			// System.out.println(list);

			Iterator<ContactList> itr = list.iterator();
			while (itr.hasNext()) {
				ContactList str = itr.next();
				str.displayContact();
			}

		}
	}


