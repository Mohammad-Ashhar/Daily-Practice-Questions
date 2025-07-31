# Last updated: 31/07/2025, 21:13:28
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.nums = []

    def inorder_travel(self, root) -> list[int]:
        if not root:
            return []
        self.inorder_travel(root.left)
        self.nums.append(root)
        self.inorder_travel(root.right)
    def build_balance(self, left, right):
        if left > right:
            return None
        mid = (left + right) // 2
        root = self.nums[mid]
        root.left = self.build_balance(left, mid - 1)
        root.right = self.build_balance(mid + 1, right)
        return root    
    def balanceBST(self, root: TreeNode) -> TreeNode:
        self.nums = []
        self.inorder_travel(root)
        return self.build_balance(0, len(self.nums) - 1)
        