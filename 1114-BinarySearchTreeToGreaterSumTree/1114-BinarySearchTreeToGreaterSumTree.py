# Last updated: 31/07/2025, 21:13:56
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def bstToGst(self, root: TreeNode) -> TreeNode:
        def flatten(node):
            res = []
            if node is None:
                return res

            res.extend(flatten(node.left))
            res.append(node)
            res.extend(flatten(node.right))
            return res

        flattened_nodes = flatten(root)

        add_sum = 0
        while len(flattened_nodes) > 0:
            curr_node = flattened_nodes.pop()
            curr_val = curr_node.val
            curr_node.val += add_sum
            add_sum += curr_val
        return root