/*Hãy tìm tất cả những nam giới tuổi dưới 45*/
SELECT * FROM (SELECT name,DATE_FORMAT(FROM_DAYS(DATEDIFF(now(),birthdate)), '%Y')+0 AS Age  FROM person.person ) AS t
 where t.Age <45;
/*Hãy tìm tất cả những nữ giới làm nghề lái xe 'driver'*/
SELECT * FROM person WHERE job = 'driver' and gender = 'Female';
/*Tính tỷ lệ nam /nữ lập trình viên trong tất cả tập dữ liệu*/

SELECT Male.MaleNo, Female.FemaleNo,Male.MaleNo/Female.FemaleNo from
 (SELECT  count(*) as MaleNo, job  from person where job = 'Developer'  and gender = 'Male' group by job) as Male inner join  
 (SELECT  count(*) as FemaleNo, job  from person where job = 'Developer'  and gender = 'Female' group by job) as Female on Male.job = Female.job;

/*Hãy tìm 5 thành phố có số lượng nữ lớn nhất*/
Select count(*) as FemaleNumber, city from person where gender ='Female' group by city order by FemaleNumber DESC limit 5