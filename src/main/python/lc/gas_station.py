class Solution:
  # @param gas, a list of integers
  # @param cost, a list of integers
  # @return an integer
  def canCompleteCircuit(self, gas, cost):
    start_idx = total = remain = 0      
    for idx in range(len(gas)):
      remain += gas[idx] - cost[idx]
      total += gas[idx] - cost[idx]
      if remain < 0:  # try start from next station
        start_idx = idx + 1
        remain = 0
    
    return start_idx if total >= 0 else -1
