class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        prevEnd = intervals[0][1]
        ans = []
        ans.append(intervals[0])

        for start, end in intervals[1:]:

            if start > prevEnd:
                prevEnd = end
                ans.append([start, end])
            else:
                maxV = max(end, prevEnd)
                ans[len(ans) - 1][1] = maxV
                prevEnd = maxV

        return ans



        