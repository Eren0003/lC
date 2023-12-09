package org.example.leetcode.binaryTree;

import java.util.*;
import java.util.stream.Collectors;

public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;
        private static int number = 0;
        private static int count = 0;
        private static int result = 0;
        static int length = 0;
        private static int max = -1;
        static int result1 = 0;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public static void main(String[] args) {
            TreeNode l = new TreeNode(3);
            TreeNode m = new TreeNode(4, l, (TreeNode)null);
            TreeNode n = new TreeNode(1);
            TreeNode o = new TreeNode(2, n, m);
            TreeNode p = new TreeNode(8);
            TreeNode q = new TreeNode(10);
            TreeNode r = new TreeNode(9, p, q);
            TreeNode s = new TreeNode(6);
            TreeNode t = new TreeNode(7, s, r);
            new TreeNode(5, o, t);
            TreeNode temp = new TreeNode(2);
            new TreeNode(1, (TreeNode)null, temp);
            TreeNode sl = new TreeNode(3);
            TreeNode sr = new TreeNode(3);
            TreeNode ml = new TreeNode(4);
            TreeNode mr = new TreeNode(4);
            TreeNode nl = new TreeNode(2, sl, ml);
            TreeNode nr = new TreeNode(2, mr, sr);
            new TreeNode(1, nl, nr);
            TreeNode b1 = new TreeNode(1);
            TreeNode b2 = new TreeNode(2, b1, (TreeNode)null);
            TreeNode b4 = new TreeNode(4);
            TreeNode b3 = new TreeNode(3, b2, b4);
            TreeNode b5 = new TreeNode(6);
            new TreeNode(5, b3, b5);
            new ArrayList();
            TreeNode treeNode = new TreeNode(1);
            treeNode.left = new TreeNode(7);
            treeNode.right = new TreeNode(0);
            treeNode.left.left = new TreeNode(7);
            treeNode.left.right = new TreeNode(-8);
            TreeNode node = new TreeNode(4);
            node.left = new TreeNode(8);
            node.right = new TreeNode(5);
            node.left.left = new TreeNode(0);
            node.left.right = new TreeNode(1);
            node.right.right = new TreeNode(6);
            System.out.println(tree2str(node));
        }

        static int averageOfSubTree(TreeNode root) {
            int[] result = rec(root, 0, 0);
            return result[2];
        }

        static int[] rec(TreeNode root, int sum, int visited) {
            if (root == null) {
                return new int[3];
            } else {
                int[] result = rec(root.left, sum, visited);
                int[] temp = rec(root.right, sum, visited);
                result[0] += temp[0];
                result[1] += temp[1];
                result[2] += temp[2];
                result[0] += root.val;
                int var10002 = result[1]++;
                if (result[0] / result[1] == root.val) {
                    var10002 = result[2]++;
                }

                return result;
            }
        }

        static List<Integer> largestValueInRow(TreeNode root) {
            List<Integer> list = new ArrayList();
            Queue<TreeNode> queue = new LinkedList();
            queue.add(root);
            list.add(root.val);

            while(!queue.isEmpty()) {
                Queue<TreeNode> innerQueue = new LinkedList();
                int max = 0;

                TreeNode temp;
                while(!queue.isEmpty()) {
                    temp = (TreeNode)queue.poll();
                    if (temp.left != null) {
                        innerQueue.offer(temp.left);
                    }

                    if (temp.right != null) {
                        innerQueue.offer(temp.right);
                    }
                }

                while(!innerQueue.isEmpty()) {
                    temp = (TreeNode)innerQueue.poll();
                    max = Math.max(max, temp.val);
                    queue.offer(temp);
                }

                list.add(max);
            }

            if (list.size() > 1 && (Integer)list.get(list.size() - 1) == 0) {
                list.remove(list.size() - 1);
            }

            return list;
        }

        public int kthSmallest(TreeNode root, int k) {
            count = k;
            this.helper(root);
            return number;
        }

        public void helper(TreeNode n) {
            if (n.left != null) {
                this.helper(n.left);
            }

            --count;
            if (count == 0) {
                number = n.val;
            } else {
                if (n.right != null) {
                    this.helper(n.right);
                }

            }
        }

        static List<Integer> print(TreeNode node) {
            List<Integer> list = new ArrayList();
            pre(node, 3, list);
            System.out.println(result1);
            return list;
        }

        static void println(TreeNode root) {
            new ArrayList();
            inOrder(root);
        }

        static void inOrder(TreeNode root) {
            if (root != null) {
                inOrder(root.left);
                System.out.println(root.val);
                inOrder(root.right);
            }
        }

        static void pre(TreeNode node, int k, List<Integer> list) {
            if (node != null && k >= list.size()) {
                pre(node.left, k, list);
                list.add(node.val);
                if (k == list.size()) {
                    result1 = node.val;
                } else {
                    pre(node.right, k, list);
                }
            }
        }

        static void preOrder(TreeNode node, List<String> list) {
            if (node != null) {
                list.add("" + node.val);
                if (node.left != null) {
                    list.add("(");
                    preOrder(node.left, list);
                    list.add(")");
                }

                if (node.right != null) {
                    list.add("(");
                    preOrder(node.right, list);
                    list.add(")");
                }

            }
        }

        static void postOrder(TreeNode node, List<Integer> list) {
            if (node != null) {
                postOrder(node.left, list);
                postOrder(node.right, list);
                list.add(node.val);
            }
        }

        static TreeNode invertTree(TreeNode root) {
            invert(root);
            return root;
        }

        static void invert(TreeNode node) {
            if (node != null) {
                TreeNode left = node.left;
                node.left = node.right;
                node.right = left;
                invert(node.left);
                invert(node.right);
            }
        }

        static boolean hasPathSum(TreeNode root, int targetSum) {
            return sum(root, targetSum, 0);
        }

        static boolean sum(TreeNode root, int targetSum, int sum) {
            if (root.left == null && root.right == null && targetSum == sum) {
                return true;
            } else if (root != null && sum <= targetSum) {
                return sum(root.left, targetSum, sum + root.val) || sum(root.right, targetSum, sum + root.val);
            } else {
                return false;
            }
        }

        static void preOrderString(TreeNode node, StringBuilder result) {
            if (node != null) {
                result.append(node.val);
                if (node.left == null && node.right != null) {
                    result.append("()");
                }

                if (node.left != null) {
                    result.append("(");
                    preOrderString(node.left, result);
                    result.append(")");
                }

                if (node.right != null) {
                    result.append("(");
                    preOrderString(node.right, result);
                    result.append(")");
                }

            }
        }

        static boolean isSymmetric(TreeNode root) {
            if (root.left == null && root.right == null) {
                return true;
            } else {
                return root.left != null && root.right != null ? symmetric(root.left, root.right) : false;
            }
        }

        static boolean symmetric(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            } else if (left != null && right != null && left.val == right.val) {
                return symmetric(left.left, right.right) && symmetric(left.right, right.left);
            } else {
                return false;
            }
        }

        static boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if (root == null) {
                return false;
            } else if (root.val == subRoot.val && equal(root, subRoot)) {
                return true;
            } else {
                return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
            }
        }

        static boolean equal(TreeNode root, TreeNode subRoot) {
            if (root == null && subRoot == null) {
                return true;
            } else if (root != null && subRoot != null && root.val == subRoot.val) {
                return equal(root.left, subRoot.left) && equal(root.right, subRoot.right);
            } else {
                return false;
            }
        }

        static void levelOrder(TreeNode root, List<List<Integer>> list) {
            LinkedList<TreeNode> linkedList = new LinkedList();
            linkedList.add(root);
            List<Integer> l = new ArrayList();
            l.add(root.val);
            list.add(l);

            while(!linkedList.isEmpty()) {
                List<Integer> temp = new ArrayList();
                Queue<TreeNode> inner = new LinkedList();
                int size = linkedList.size();

                for(int i = 0; i < size; ++i) {
                    if (((TreeNode)linkedList.peekFirst()).left != null) {
                        inner.add(((TreeNode)linkedList.peekFirst()).left);
                    }

                    if (((TreeNode)linkedList.peekFirst()).right != null) {
                        inner.add(((TreeNode)linkedList.peekFirst()).right);
                    }

                    linkedList.poll();
                }

                while(!inner.isEmpty()) {
                    TreeNode poll = (TreeNode)inner.poll();
                    temp.add(poll.val);
                    linkedList.add(poll);
                }

                if (!temp.isEmpty()) {
                    list.add(temp);
                }
            }

        }

        static List<Integer> rightView(TreeNode root) {
            List<Integer> list = new ArrayList();
            Set<Integer> set = new HashSet();
            view(root, list, 1, set);
            return list;
        }

        static void view(TreeNode root, List<Integer> list, int level, Set<Integer> set) {
            if (root != null) {
                if (!set.contains(level)) {
                    list.add(root.val);
                    set.add(level);
                }

                view(root.right, list, level + 1, set);
                view(root.left, list, level + 1, set);
            }
        }

        static int sumNumber(TreeNode root) {
            List<Integer> list = new ArrayList();
            sum(root, list, 0);
            int sum = 0;

            int i;
            for(Iterator var3 = list.iterator(); var3.hasNext(); sum += i) {
                i = (Integer)var3.next();
            }

            return sum;
        }

        static void sum(TreeNode root, List<Integer> list, int sum) {
            if (root != null) {
                if (root.left == null && root.right == null) {
                    sum = sum * 10 + root.val;
                    list.add(sum);
                } else {
                    sum = sum * 10 + root.val;
                    sum(root.left, list, sum);
                    sum(root.right, list, sum);
                }
            }
        }

        static List<List<Integer>> zigzagOrder(TreeNode root) {
            List<List<Integer>> list = new ArrayList();
            LinkedList<TreeNode> linkedList = new LinkedList();
            linkedList.add(root);
            list.add(List.of(root.val));

            while(!linkedList.isEmpty()) {
                LinkedList<TreeNode> inner = new LinkedList();

                ArrayList innerList;
                for(innerList = new ArrayList(); !linkedList.isEmpty(); linkedList.poll()) {
                    if (((TreeNode)linkedList.peekFirst()).left != null) {
                        inner.addFirst(((TreeNode)linkedList.peekFirst()).left);
                    }

                    if (((TreeNode)linkedList.peekFirst()).right != null) {
                        inner.addFirst(((TreeNode)linkedList.peekFirst()).right);
                    }
                }

                while(!inner.isEmpty()) {
                    TreeNode node = (TreeNode)inner.pop();
                    innerList.add(node.val);
                    linkedList.addFirst(node);
                }

                list.add(innerList);
            }

            return list;
        }

        static boolean isValid(TreeNode root) {
            if (root == null) {
                return true;
            } else if (root.left != null && root.right != null && (root.left.val > root.val || root.right.val < root.val)) {
                return false;
            } else {
                return isValid(root.left) && isValid(root.right);
            }
        }

        static int kThElement(TreeNode root, int k) {
            List<Integer> list = new ArrayList();
            element(root, list);
            List<Integer> list1 = (List)list.stream().sorted().collect(Collectors.toList());
            return (Integer)list.get(k - 1);
        }

        static void element(TreeNode root, List<Integer> list) {
            if (root != null) {
                list.add(root.val);
                element(root.left, list);
                element(root.right, list);
            }
        }

        static int kthElement(TreeNode root, int k) {
            leftLength(root.left);
            return length;
        }

        static void leftLength(TreeNode root) {
            if (root != null) {
                ++length;
                leftLength(root.left);
                leftLength(root.right);
            }
        }

        static int findBottomLeft(TreeNode root) {
            HashMap<Integer, Integer> map = new HashMap();
            bottomLeft(root, map, 1);
            int temp = max;
            new Stack();
            max = -1;
            return (Integer)map.get(temp);
        }

        static void bottomLeft(TreeNode root, HashMap<Integer, Integer> map, int level) {
            if (root != null) {
                if (!map.containsKey(level)) {
                    map.put(level, root.val);
                }

                if (level > max) {
                    max = level;
                }

                bottomLeft(root.left, map, level + 1);
                bottomLeft(root.right, map, level + 1);
            }
        }

        static int pathSum(TreeNode root, int targetSum) {
            List<Integer> list = new ArrayList();
            dfs(root, targetSum, list, 0);
            return result1 / 2;
        }

        static void dfs(TreeNode root, int targetSum, List<Integer> list, int sum) {
            if (list.contains(sum - targetSum)) {
                ++result1;
            }

            if (sum == targetSum) {
                ++result1;
            }

            if (root != null) {
                list.add(sum + root.val);
                dfs(root.left, targetSum, list, sum + root.val);
                dfs(root.right, targetSum, list, sum + root.val);
            }
        }

        static boolean isValidBST(TreeNode root) {
            if (root == null) {
                return true;
            } else if (root.right != null && root.val >= root.right.val) {
                return false;
            } else if (root.left != null && root.val <= root.left.val) {
                return false;
            } else {
                return dfs(root.left, root.val, "left") && dfs(root.right, root.val, "right");
            }
        }

        static boolean dfs(TreeNode root, int rootVal, String direction) {
            if (root == null) {
                return true;
            } else {
                if (direction.equals("left")) {
                    if (root.left != null && root.left.val >= rootVal || root.right != null && root.right.val >= rootVal) {
                        return false;
                    }
                } else if (root.left != null && root.left.val <= rootVal || root.right != null && root.right.val <= rootVal) {
                    return false;
                }

                if (root.left != null && root.left.val >= root.val) {
                    return false;
                } else if (root.right != null && root.right.val <= root.val) {
                    return false;
                } else {
                    return dfs(root.left, rootVal, direction) && dfs(root.right, rootVal, direction);
                }
            }
        }

        static int maxLevelSum(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList();
            queue.add(root);
            int max = -2147483647;
            int level = 1;

            int index;
            for(index = level; !queue.isEmpty(); ++level) {
                Queue<TreeNode> innerQueue = new LinkedList(queue);
                queue.removeAll(queue);

                int sum;
                for(sum = 0; !innerQueue.isEmpty(); sum += ((TreeNode)innerQueue.poll()).val) {
                    if (((TreeNode)innerQueue.peek()).left != null) {
                        queue.add(((TreeNode)innerQueue.peek()).left);
                    }

                    if (((TreeNode)innerQueue.peek()).right != null) {
                        queue.add(((TreeNode)innerQueue.peek()).right);
                    }
                }

                if (sum > max) {
                    max = sum;
                    index = level;
                }
            }

            return index;
        }

        static long kthLargestSum(TreeNode root, int k) {
            List<Long> list = new ArrayList();
            Queue<TreeNode> queue = new LinkedList();
            queue.add(root);

            int level;
            for(level = 1; !queue.isEmpty(); ++level) {
                Queue<TreeNode> innerQueue = new LinkedList(queue);
                queue.removeAll(queue);

                long sum;
                for(sum = 0L; !innerQueue.isEmpty(); sum += (long)((TreeNode)innerQueue.poll()).val) {
                    if (((TreeNode)innerQueue.peek()).left != null) {
                        queue.add(((TreeNode)innerQueue.peek()).left);
                    }

                    if (((TreeNode)innerQueue.peek()).right != null) {
                        queue.add(((TreeNode)innerQueue.peek()).right);
                    }
                }

                list.add(sum);
            }

            List<Long> list1 = (List)list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            if (k >= level) {
                return -1L;
            } else {
                return (Long)list.get(k - 1);
            }
        }
    public static String tree2str(TreeNode root) {
        String result = "";
        dfs(root,result);
        return result;
    }
    static void dfs(TreeNode root,String result){
        if(root == null){
            return ;
        }
        result += root.val;
        if(root.left == null && root.right == null){
            result += "()";
        }
        if(root.left != null){
            result += "(";
            dfs(root.left ,result);
            result += ")";
        }if(root.right != null){
            result += "(";
            dfs(root.right,result);
            result += ")";
        }
    }
}

