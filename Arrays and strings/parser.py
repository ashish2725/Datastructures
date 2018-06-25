import json

with open('snowcomm.txt') as json_file:
    data = json.load(json_file)
    for p in data['test']:
        print('orderId: ' + p['MessageId'])
        print('')
