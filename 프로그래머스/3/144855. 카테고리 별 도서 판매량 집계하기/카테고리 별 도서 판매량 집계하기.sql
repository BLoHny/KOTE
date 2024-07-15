SELECT category, sum(bs.sales) as total_sales
from book b join book_sales bs
where b.book_id = bs.book_id and date_format(bs.sales_date, '%Y-%m') = '2022-01'
group by b.category
order by b.category
