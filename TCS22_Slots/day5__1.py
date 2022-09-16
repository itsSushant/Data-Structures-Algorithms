# def fun(x, y, n) :
    
#     arr[x-1] = y
#     ans = 1
#     for i in range(1,n):
#         if arr[i] != arr[i-1] :
#             ans += 1
#     return ans


# n = int(input())
# k = int(input()) 

# arr = []
# for i in range(n):
#     arr.append(int(input()))

# for i in range(k):

#     x =  int(input()) 
#     y =  int(input())

#     print(fun(x,y,n), ends = " ")



def fun(x, y, n):
   arr[x - 1] = y
   ans = 1
   for i in range(1, n):
       if arr[i] != arr[i - 1]:
           ans += 1
   return ans


n = int(input())
k = int(input())
arr = []
for i in range(n):
   arr.append(int(input()))
for i in range(k):
   x = int(input())
   y = int(input())
   print(fun(x, y, n), end="")