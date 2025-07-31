# Last updated: 31/07/2025, 21:12:12
class Solution:
    def longestSubarray(self, nums: List[int], limit: int) -> int:
        max_deque = deque()
        min_deque = deque()
    
        start = 0
        max_length = 0
    
        for end in range(len(nums)):
            # Maintain the max deque
            while max_deque and nums[max_deque[-1]] <= nums[end]:
                max_deque.pop()
            max_deque.append(end)
        
        # Maintain the min deque
            while min_deque and nums[min_deque[-1]] >= nums[end]:
                min_deque.pop()
            min_deque.append(end)
        
        # If the current window does not satisfy the condition, move the start pointer
            while nums[max_deque[0]] - nums[min_deque[0]] > limit:
                start += 1
                if max_deque[0] < start:
                    max_deque.popleft()
                if min_deque[0] < start:
                    min_deque.popleft()
        
        # Update the maximum length of the subarray found so far
            max_length = max(max_length, end - start + 1)
    
        return max_length
                
        