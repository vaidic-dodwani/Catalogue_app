int(input())
for i in range(t):
l=int(input())
r=int(input())
j=int(input())
b=int(input())
p=int(input())
q=int(input())

    money=0
    if p>q:
        if l>b:
            money+=(b*p)
        else:
            money+=(l*p)
            b-=l
            lis=[r,j,b]
            money+=(min(lis)*q)
        print(money)
    else:
        lis=[r,j,b]
        money+=(min(lis)*q)
        b-=min(lis)
        if b!=0:
            newlis=[l,b]
            money+=(min(newlis)*p)
        print(money)
