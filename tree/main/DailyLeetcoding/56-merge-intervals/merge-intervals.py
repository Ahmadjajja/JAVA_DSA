class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        ans = []
        ans.append(intervals[0])

        for start, end in intervals[1:]:

            if start > ans[-1][1]:
                ans.append([start, end])
            else:
                maxV = max(end, ans[-1][1])
                ans[-1][1] = maxV

        return ans



        