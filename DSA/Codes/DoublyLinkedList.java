
import java.util.*;

class Dnode {

    int data;
    Dnode left, right;

    Dnode(int data)

    {
        this.data = data;
        left = null;
        right = null;
    }
}

public class DoublyLinkedList {
    Dnode root;

    void initList() {
        root = null;
    }

    void insertLeft(int data) {
        Dnode n = new Dnode(data);
        if (root == null)
            root = n;
        else {
            n.right = root;
            root.left = n; // Dual way Referance.
            root = n;
        }
    }

    void deleteLeft() {
        if (root == null) {
            System.out.println("Empty list.");

        } else {
            Dnode t = root;
            root = root.right;
            root.left = null;
            System.out.println("Deleted : " + t.data);

        }

    }

    void insertRight(int data) {
        Dnode n = new Dnode(data);
        if (root == null)
            root = n;
        else {

            Dnode t = root;
            while (t.right != null) {
                t = t.right;

            }
            t.right = n;
            n.left = t;

        }
    }

    void deleteRight() {
        if (root == null) {
            System.out.println("Empty list.");

        } else {
            Dnode t = root;

            while (t.right != null) {

                t = t.right;
            }
            Dnode t2 = t.left;
            t2.right = null;
            System.out.println("Deleted : " + t.data);
        }
    }

    void printList() {
        if (root == null) {
            System.out.println("Empty list.");
        } else {

            Dnode t = root;
            while (t != null) {

                System.out.print("\t" + t.data);
                t = t.right;
            }
        }
        System.out.println("\n");

    }

    void printListReverse() {
        if (root == null) {
            System.out.println("Empty list.");
        } else {

            Dnode t = root;
            while (t.right != null) {

                t = t.right;

            }
            while (t != null) {

                System.out.print("\t" + t.data);
                t = t.left;
            }
        }

    }

    void SearchList(int key) {

        if (root == null) {
            System.out.println("Empty list.");
        } else {

            Dnode t = root;
            int c = 0;
            while (t != null) {
                c++;
                if (t.data == key) {
                    System.out.println("Found @ Position : " + c);
                    return;
                }
                t = t.right;
            }
            if (t == null)
                System.out.println("Not Found.");
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        obj.initList();
        int ch = 0;

        do {
            System.out.println(
                    "\nEnter Choice :\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.Search\n0.Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Element : ");
                    int e = sc.nextInt();
                    obj.insertLeft(e);
                    System.out.println("Element Inserted : " + e + "\n");
                    break;
                case 2:
                    System.out.println("Enter Element : ");
                    e = sc.nextInt();
                    obj.insertRight(e);
                    System.out.println("Element Inserted :" + e);

                    break;
                case 3:

                    obj.deleteLeft();
                    break;
                case 4:
                    obj.deleteRight();
                    break;
                case 5:
                    obj.printList();
                    obj.printListReverse();
                    break;
                case 6:
                    System.out.println("Enter Key To Find : ");
                    int key = sc.nextInt();
                    obj.SearchList(key);
                    break;
                case 0:
                    System.out.println("Exiting...Thanks for using code By Saurabh Sonawane");
                    break;
                default:
                    break;
            }

        } while (ch != 0);
        sc.close();
    }
}
