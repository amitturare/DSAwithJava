package com.amit.Q445;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(1);
//        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode ans = addTwoNumbers(l1, l2);

        int size = 0;
        ListNode pointer = ans;
        while (pointer != null) {
            size++;
            pointer = pointer.next;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(ans.val + " -> ");
            ans = ans.next;
        }
        System.out.println("END");
    }
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        int size1 = getSize(p1);
        ListNode p2 = l2;
        int size2 = getSize(p2);

        ArrayList<Integer> ans = new ArrayList<>();
        boolean flag = true;
        int carry = 0;
        while (flag) {
            int result = 0;

            result += carry + (getValue(p1, size1 - 1) + getValue(p2, size2 - 1));
            size1--;
            size2--;

            ans.add(result % 10);
            carry = result / 10;

            if (size1 == 0 && size2 == 0 && carry != 0) {
                ans.add(carry);
            }

            if (size1 < 0 || size2 < 0) {
                flag = false;
            }
        }

        ListNode resultLL = new ListNode();
        ListNode result = resultLL;
        for (int i = 0; i < ans.size(); i++) {
            resultLL.next = new ListNode(ans.get(ans.size() - 1 - i));
            resultLL = resultLL.next;
        }

        return result.next;
    }

    static int getSize (ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }

        return size;
    }

    static int getValue(ListNode head, int index) {
        if (index >= 0) {
            for (int i = 0; i < index; i++) {
                head = head.next;
            }
            return head.val;
        }
        return 0;
    }
}
