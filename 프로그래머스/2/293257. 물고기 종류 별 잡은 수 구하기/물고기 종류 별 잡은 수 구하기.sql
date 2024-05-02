SELECT COUNT(fn.fish_name) as FISH_COUNT, fn.FISH_NAME
FROM fish_info fi
JOIN fish_name_info fn ON fi.fish_type = fn.fish_type
GROUP BY fn.fish_name
order by count(fn.fish_name) desc
