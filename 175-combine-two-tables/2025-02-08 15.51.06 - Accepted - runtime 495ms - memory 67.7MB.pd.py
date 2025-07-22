import pandas as pd

def combine_two_tables(person: pd.DataFrame, address: pd.DataFrame) -> pd.DataFrame:

    table=pd.merge(person, address, on='personId', how='left')
    # combined_table = pd.merge(person, address, on='personId', how='left')
    return table[['firstName', 'lastName', 'city', 'state']]
    return table