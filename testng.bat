set projectLocation=C:\Users\nisha.r\eclipse-workspace\CVS_Auto_2024_B2_64Bit

cd %projectLocation%

set classpath=%projectLocation%;%projectLocation%\testNG\*

java -cp "%classpath%" org.testng.TestNG %projectLocation%\NishaRautomationFile.xml
