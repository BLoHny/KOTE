SELECT uu.user_id, uu.nickname, sum(ub.price) as total_sales
from used_goods_board ub, used_goods_user uu
where ub.status = 'DONE' and ub.writer_id = uu.user_id
group by uu.user_id, uu.nickname
having sum(ub.price) >= 700000
order by sum(ub.price)