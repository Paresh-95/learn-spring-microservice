-- product_id values refer to products seeded by inventory-service's data.sql
INSERT INTO orders (order_status, total_price) VALUES
('CONFIRMED', 82597.00),
('PENDING', 124998.00),
('CANCELLED', 27998.00),
('CONFIRMED', 71998.00);

INSERT INTO order_item (product_id, quantity, order_id) VALUES
(1, 1, 1),
(10, 2, 1),
(5, 1, 2),
(7, 1, 2),
(8, 2, 3),
(4, 1, 4),
(9, 1, 4);
