--Table: Customers

--+-------------+---------+
--| Column Name | Type    |
--+-------------+---------+
--| id          | int     |
--| name        | varchar |
--+-------------+---------+
--id is the primary key column for this table.
--Each row of this table indicates the ID and name of a customer.
 

--Table: Orders

--+-------------+------+
--| Column Name | Type |
--+-------------+------+
--| id          | int  |
--| customerId  | int  |
--+-------------+------+
--id is the primary key column for this table.
--customerId is a foreign key of the ID from the Customers table.
--Each row of this table indicates the ID of an order and the ID of the customer who ordered it.
 

--Write an SQL query to report all customers who never order anything.

--Return the result table in any order.

SELECT name as Customers from Customers c 
LEFT JOIN Orders o on c.id=o.CustomerId
WHERE o.CustomerId is NULL