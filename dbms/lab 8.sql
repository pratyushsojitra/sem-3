create table sales_data(
Region varchar(30),
product varchar(30),
Sales_Amount int,
year int
)

insert into sales_data values('North America','Watch',1500,2023)
insert into sales_data values('Europe','Mobile',1200,2023)
insert into sales_data values('Asia','Watch',1800,2023)
insert into sales_data values('North America','TV',900,2024)
insert into sales_data values('Europe','Watch',2000,2024)
insert into sales_data values('Asia','Mobile',1000,2024)
insert into sales_data values('North America','Mobile',1600,2023)
insert into sales_data values('Europe','TV',1500,2023)
insert into sales_data values('Asia','TV',1100,2024)
insert into sales_data values('North America','Watch',1700,2024)

--Part – A:


--1. Display Total Sales Amount by Region.
select region,sum(Sales_Amount) as total_sales from sales_data group by region

--2. Display Average Sales Amount by Product
select product,avg(Sales_Amount) as avg_sales from sales_data group by product

--3. Display Maximum Sales Amount by Year
select year,max(Sales_Amount) as max_sales from sales_data group by year

--4. Display Minimum Sales Amount by Region and Year
select year,region,min(Sales_Amount) as min_sales from sales_data group by year,region

--5. Count of Products Sold by Region
select region,count(product) as count_sales from sales_data group by region

--6. Display Sales Amount by Year and Product
select year,product,sum(Sales_Amount) as sales_amount from sales_data group by year,product

--7. Display Regions with Total Sales Greater Than 5000
select region,sum(sales_amount) as total_sales from sales_data group by region having sum(sales_amount)>5000 

--8. Display Products with Average Sales Less Than 10000
select product,avg(sales_amount) as avg_sales from sales_data group by product having avg(sales_amount)<10000 

--9. Display Years with Maximum Sales Exceeding 500
select year,max(Sales_Amount) as max_sales from sales_data group by year having max(sales_amount)>500 

--10. Display Regions with at Least 3 Distinct Products Sold.
select region,count(distinct(product)) as count_sales from sales_data group by region having  count(distinct(product))>=3

--11. Display Years with Minimum Sales Less Than 1000
select year,min(Sales_Amount) as min_sales from sales_data where sales_amount <1000 group by year

--12. Display Total Sales Amount by Region for Year 2023, Sorted by Total Amount
select region,sum(Sales_Amount) as total_sales from sales_data where year=2023 group by region order by sum(Sales_amount)


--Part – B:


--1. Display Count of Orders by Year and Region, Sorted by Year and Region
select year,region,count(sales_amount) as count from sales_data group by year,region order by year,region

--2. Display Regions with Maximum Sales Amount Exceeding 1000 in Any Year, Sorted by Region
select region,max(sales_amount) as max_sales from sales_data group by region having max(sales_amount)>1000 order by region

--3. Display Years with Total Sales Amount Less Than 1000, Sorted by Year Descending
select year,sum(sales_amount) as total_sales from sales_data group by year having sum(sales_amount)<1000 order by year desc

--4. Display Top 3 Regions by Total Sales Amount in Year 2024select top 3 region,sum(sales_amount) as total_sales from sales_data where year=2024 group by region --Part – C:


--1. Display Products with Average Sales Amount Between 1000 and 2000, Ordered by Product Name
select product,avg(sales_amount) as avg_amount from sales_data group by product having avg(sales_amount) between 1000 and 2000 order by product

--2. Display Years with More Than 5 Orders from Each Region
select year,region,count(sales_amount) as avg_amount from sales_data group by region,year having count(sales_amount) > 5 

--3. Display Regions with Average Sales Amount Above 1500 in Year 2023 sort by amount in descending.
select region,avg(sales_amount) as avg_amount from sales_data where year=2023 group by region having avg(sales_amount) > 1500 order by avg(sales_amount) desc

--4. Find out region wise duplicate product.
select region,product,count(product) as duplicate_product from sales_data  group by region,product having count(product) >=2

--5. Find out region wise highest sales amount.
select region,max(sales_amount) as max_sales from sales_data  group by region 