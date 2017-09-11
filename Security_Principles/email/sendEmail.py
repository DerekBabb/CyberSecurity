import smtplib

usr = "login@domain.com"
password = "password"

sender = 'you@domain.com'
receivers = ['person@domain.com'] #this needs to be a list

message = """From: From Person <you@domain.com>
To: To Person <to@todomain.com>
Subject: SMTP e-mail test

This is a test e-mail message.
"""
server = smtplib.SMTP('smtp.office365.com', 587) #this is the SMTP for a Microsoft 365 account
server.starttls()
server.login(usr,password)
server.sendmail(sender, receivers, message)
