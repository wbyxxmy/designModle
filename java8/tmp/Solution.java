package tmp;


import java.util.*;

/**
 * @author xinjian.ye
 * @date 2018/12/19
 *
 */
public class Solution {
    public static String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int top = 0;
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '(') {
                if(top++ != 0) {
                    sb.append(S.charAt(i));
                }
            } else {
                if(--top != 0) {
                    sb.append(S.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    public static List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        int[] arr = new int[26];
        boolean init = false;

        for(String str : A) {
            int[] arrTmp = new int[26];
            for(char ch : str.toCharArray()) {
                arrTmp[ch - 'a']++;
            }

            if(!init) {
                arr = arrTmp;
                init = true;
            } else {
                for(int i = 0; i < arrTmp.length; i++) {
                    arr[i] = Math.min(arr[i], arrTmp[i]);
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                char ch = (char)(i + 'a');
                result.add(ch + "");
            }
        }

        return result;
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }

        List<Node> levelNodeList = Arrays.asList(root);
        while (levelNodeList.size() > 0) {
            List<Integer> levelValList = new ArrayList<>();
            List<Node> childNodeList = new ArrayList<>();

            for (Node levelRoot : levelNodeList) {
                levelValList.add(levelRoot.val);
                childNodeList.addAll(levelRoot.children);
            }
            result.add(levelValList);
            levelNodeList = childNodeList;
        }

        return result;
    }

    public static void rangeSumBSTTest() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        System.out.println(rangeSumBST(root, 7, 15));
    }

    public static int rangeSumBST(TreeNode root, int L, int R) {
        int result = 0;

        TreeNode[] treeNodeArr = new TreeNode[10000];
        int i = 0;
        treeNodeArr[i++] = root;

        while (i > 0) {
            while (treeNodeArr[i - 1].left != null) {
                treeNodeArr[i] = treeNodeArr[i - 1].left;
                i++;
            }

            if (treeNodeArr[i - 1].val >= L && treeNodeArr[i - 1].val <= R) {
                result += treeNodeArr[i - 1].val;
            }
            i--;

            treeNodeArr[i - 1] = treeNodeArr[i - 1].right;
        }


        return result;
    }

    public static void trimBSTTest() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);

        System.out.println(trimBST(root, 1, 3));
    }

    public static TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null) {
            return null;
        }
        TreeNode p = root;

        if(root.val < L) {
            p = trimBST(root.right, L, R);
        } else if(root.val > R) {
            p = trimBST(root.left, L, R);
        } else {
            p.left = trimBST(root.left, L, R);
            p.right = trimBST(root.right, L, R);
        }
        return p;
    }

    private static boolean prime(int num) {
        int i;
        for(i = 2; i < num &&num % i != 0; i++);
        return i == num;
    }

    public static String addStrings(String num1, String num2) {
        int i = num1.length();
        int j = num2.length();
        int k = i>j?i+1:j+1;
        int inc = 0;
        char[] resultArr = new char[k];

        while(i > 0 || j > 0 || inc > 0) {
            int val;
            if(i > 0 && j > 0) {
                val = num1.charAt(i-1) - '0' + num2.charAt(j-1) - '0' + inc;
            } else if(i > 0) {
                val = num1.charAt(i-1) - '0' + inc;
            } else if(j > 0) {
                val = num2.charAt(j-1) - '0' + inc;
            } else {
                val = inc;
            }

            resultArr[--k] = (char)((val%10)+'0');
            inc = val/10;
            i--;
            j--;
        }

        StringBuilder result = new StringBuilder();
        while(k < resultArr.length) {
            result.append(resultArr[k++]);
        }

        return result.toString();
    }

    private static int countBitOne(int num) {
        int count = 0;
        while(num > 0) {
            if((num&1) == 1) count++;
            num /= 2;
        }
        return count;
    }

    public static int countPrimeSetBits(int L, int R) {
        int count = 0;

        while(L <= R) {
            if(prime(countBitOne(L++))) {
                count++;
            }
        }

        return count;
    }

    private static final String OPEN = "(";
    private static final String CLOSE = ")";

    private static TreeNode tree2strTestCase() {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(4);

        return t;
    }

    public static String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        TreeNode p = t;
        TreeNode[] nodeArr = new TreeNode[10000];
        int topIndex = 0;

        while(p != null || topIndex > 0) {
            System.out.println(sb.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(p != nodeArr[topIndex]) {
                sb.append(OPEN).append(p.val);
                nodeArr[topIndex++] = p;
            }
            if(p.left != null && p.left != nodeArr[topIndex]) {
                p = p.left;
            } else if(p.right != null && p.right != nodeArr[topIndex]) {
                sb.append(OPEN).append(CLOSE);
                p = p.right;
            } else {
                sb.append(CLOSE);
                topIndex--;
                p = nodeArr[topIndex - 1];
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("3876620623801494171", "6529364523802684779"));
    }
}

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}


 //Definition for a binary tree node.
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;

     TreeNode(int x) {
         val = x;
     }
 }
