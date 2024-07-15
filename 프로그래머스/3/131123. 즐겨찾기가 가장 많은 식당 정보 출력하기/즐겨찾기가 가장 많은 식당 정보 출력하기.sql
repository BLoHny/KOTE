SELECT ri.food_type, ri.rest_id, ri.rest_name, ri.favorites
FROM rest_info ri
JOIN (
    SELECT food_type, MAX(favorites) AS max_favorites
    FROM rest_info
    GROUP BY food_type
) sub
ON ri.food_type = sub.food_type AND ri.favorites = sub.max_favorites
ORDER BY ri.food_type DESC;