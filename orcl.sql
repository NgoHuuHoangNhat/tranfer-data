CREATE TABLE products (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(255) NOT NULL,
    price FLOAT(126) DEFAULT 0 NOT NULL,
    quantity INTEGER DEFAULT 0 NOT NULL,
    created_by VARCHAR2(255) DEFAULT 'sys',
    updated_by VARCHAR2(255) DEFAULT 'sys',
    created_at TIMESTAMP DEFAULT SYSDATE,
    updated_at TIMESTAMP DEFAULT SYSDATE,
    is_deleted NUMBER(1,0) DEFAULT 0
); 
