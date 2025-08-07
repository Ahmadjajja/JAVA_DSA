class TimeMap:

    def __init__(self):
        self.timemap = {}  # ✅ use self.timemap instead of timemap

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key in self.timemap:  # ✅ use self.timemap
            self.timemap[key].append([timestamp, value])
        else:
            self.timemap[key] = [[timestamp, value]]

    def get(self, key: str, timestamp: int) -> str:
        if key in self.timemap:  # ✅ use self.timemap
            values = self.timemap[key]

            l, r = 0, len(values) - 1
            res = ""  # ✅ store the best match

            while l <= r:
                mid = (l + r) // 2

                if values[mid][0] == timestamp:
                    return values[mid][1]  # ✅ return value, not timestamp
                elif values[mid][0] < timestamp:
                    res = values[mid][1]  # ✅ possible answer, move right
                    l = mid + 1
                else:
                    r = mid - 1  # ✅ move left
            return res  # ✅ return closest match <= timestamp
        else:
            return ""  # ✅ correctly placed fallback
