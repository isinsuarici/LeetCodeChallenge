
select sell_date, count(product) num_sold, STRING_AGG(product,',') WITHIN GROUP(order by product) as products from (select distinct * from Activities) as a 
group by sell_date
order by sell_date