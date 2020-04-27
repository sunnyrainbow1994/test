#coding:utf-8

import smtplib
from email.mime.text import MIMEText
from email.header import Header
sender='1533470585@qq.com'
receiver='1661240037@qq.com'
subject='秋日春之一日'
smtpserver='smtp.qq.com'
msg = MIMEText('<html><h1>然后微凉的风，夹着你的清甜，你是我温暖的手套，冰冷的啤酒，带着阳光味道的衬衫，日复一日的梦想</h1></html>','html','utf-8')
msg['Subject']=subject
smtp=smtplib.SMTP()
smtp.connect('smtp.qq.com')
smtp.login('1533470585@qq.com','yscndwfflqbwgaea')
smtp.sendmail(sender,receiver,msg.as_string())
