select id,case when p_id is null then 'Root' 
when id not in (select distinct p_id from tree where p_id is not null) then 'Leaf'
else 'Inner' end as type from tree
order by 1