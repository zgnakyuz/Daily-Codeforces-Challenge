from selenium import webdriver
import sys
import os

options1 = webdriver.ChromeOptions()
options1.binary_location = r"C:\Program Files\Google\Chrome\Application\chrome.exe"
chrome_driver_binary = r"D:\Desktop\Coding\chromedriver.exe"
driver = webdriver.Chrome(executable_path=chrome_driver_binary, options=options1)
driver.get("https://codeforces.com/problemset/page/" + sys.argv[1] + "?order=BY_RATING_ASC")

q_count = int(sys.argv[2])
q_num = int(sys.argv[3]) + 1
day_count = int(sys.argv[4])

links = []
folder_name = str(day_count) + ") "

for i in range(q_count):
    question = driver.find_element_by_xpath('//*[@id="pageContent"]/div[2]/div[6]/table/tbody/tr[' + str(q_num) + ']/td[2]/div[1]/a')
    link = question.get_attribute('href')

    folder_name += driver.find_element_by_xpath('//*[@id="pageContent"]/div[2]/div[6]/table/tbody/tr[' + str(q_num) + ']/td[1]/a').text

    if i != q_count - 1:
        folder_name += " - "
        link += "  " + "\n"

    links.append(link)
    q_num += 1

os.mkdir("C:\\Users\\Ozgun\\Desktop\\" + folder_name)
f = open("C:\\Users\\Ozgun\\Desktop\\" + folder_name + "\\README.md", "w")

for link in links:
    f.write(link)

driver.close()
f.close()
