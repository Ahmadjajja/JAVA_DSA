class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        if len(intervals) == 0:
            return [newInterval]
        ans = [] # [[1, 2], [3, 8]]
        keepContinue = False
        for i in range(len(intervals)):
            
            if newInterval and intervals[i][0] < newInterval[0] and intervals[i][1] < newInterval[0]:
                ans.append(intervals[i])
            elif not keepContinue:
                if intervals[i][0] < newInterval[0]:
                    ans.append(intervals[i])
                    ans.append(newInterval)
                    newInterval = None  
                elif intervals[i][0] > newInterval[0]:
                    ans.append(newInterval)
                    ans.append(intervals[i])
                    newInterval = None  
                elif intervals[i][1] < newInterval[1]:
                    ans.append(intervals[i])
                    ans.append(newInterval)
                    newInterval = None  
                else:
                    ans.append(newInterval)
                    ans.append(intervals[i])
                    newInterval = None  
                keepContinue = True
            else:
                ans.append(intervals[i])
        
        if newInterval != None:
            ans.append(newInterval)
        
        print("ans : ", ans)
        finalAns = [ans[0]]
        
        for i in range(1, len(ans)):
            if finalAns[-1][1] >= ans[i][0]:
                finalAns[-1][1] = max(finalAns[-1][1], ans[i][1])
            else:
                finalAns.append(ans[i])

        
        print("ans after merging: ", finalAns)

        return finalAns


            
