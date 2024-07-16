select ub.title, ub.board_id, ur.reply_id, ur.writer_id, ur.contents, 
date_format(ur.created_date, "%Y-%m-%d") as created_date
from used_goods_board ub join used_goods_reply ur
where ub.board_id = ur.board_id and date_format(ub.created_date, "%Y-%m") = '2022-10'
order by ur.created_date, ub.title