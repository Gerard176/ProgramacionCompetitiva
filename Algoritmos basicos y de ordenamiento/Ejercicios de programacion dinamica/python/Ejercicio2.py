class main:    
    def dp(i):
        if i<0:
            return 0
        if calculado[i]:
            return memo[i]
        memo[i] = max(0, dp(i-1) + array[i])  
        calculado[i] = True
        return memo[i] 


    def AlgoritmoKadane(array):
        sum = 0 
        res = 0
        for i in range(len(array)):
            sum += array[i]
            if sum < 0:
                sum = 0
            if sum < res:
                res = res
            elif sum > res:
                res = sum       
        return res
    global array
    array = [4,-5,4,-3,4,4,-4,4,-5]
    global memo 
    memo = []*len(array)
    global calculado
    calculado = []*len(array)
    print(AlgoritmoKadane(array))
