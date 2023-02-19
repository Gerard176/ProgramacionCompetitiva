class Main:
    array = [2,5,7,9,1,5,8,3]

    def Sort(array):
        for i in range(len(array)-1):
            for j in range(i+1,len(array)):
                if array[i]>array[j]:
                    aux = array[i]
                    array[i] = array[j]
                    array[j] = aux
        return array   
    Sort(array)
    for i in range(len(array)):
        print(array[i])             