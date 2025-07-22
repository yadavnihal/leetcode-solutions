import pandas as pd

def rising_temperature(weather: pd.DataFrame) -> pd.DataFrame:
    n=len(weather)
    weather.sort_values(by='recordDate',inplace=True)
    if n<=1:
        return pd.DataFrame({'Id':weather['id']})
    lst=[]

    temp=weather['temperature']
    
    for i in range(1,n):
        pDate=weather['recordDate'].iloc[i-1]
        cDate=weather['recordDate'].iloc[i]
        curr=temp.iloc[i]
        if(cDate-pDate).days==1:
            if(curr>temp.iloc[i-1]):
                lst.append(weather['id'].iloc[i])
        
    return pd.DataFrame({'Id':lst})
