class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        candidates.sort()
        answer = []

        def DFS(index, com, sum):
            nonlocal answer

            # base condition
            if sum >= target:
                if sum == target:
                    answer.append(com.copy())
                    return
                else:
                    return
            
            if index >= len(candidates):
                return
            
            # add current element to combination
            com.append(candidates[index])
            sum += candidates[index]

            DFS(index + 1, com, sum)

            com.pop()
            sum -= candidates[index]

            # ignore current element 
            while index + 1 < len(candidates) and candidates[index] == candidates[index + 1]:
                index += 1

            DFS(index + 1, com, sum)

        DFS(0, [], 0)

        return answer
        