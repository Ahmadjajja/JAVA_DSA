class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        ans = []
        ans.append(intervals[0])

        for start, end in intervals[1:]:

            if start > ans[len(ans) - 1][1]:
                ans.append([start, end])
            else:
                maxV = max(end, ans[len(ans) - 1][1])
                ans[len(ans) - 1][1] = maxV

        return ans



        