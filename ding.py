import json
import requests
 
url = "https://oapi.dingtalk.com/robot/send?access_token=e0ea378815d707db844cfa3edf4efdc6b35ce68f7d2821707389b1c760e64bb3"
 
headers = {
    "Content-type": "application/json",
    "Charset": "utf-8"
}
requests_data = {
    "msgtype": "text",
    "text": {
        "content": "我就是我"
    },
    "at": {
        "atMobiles": [
 
        ],
        "isAtAll": True
    }
}

