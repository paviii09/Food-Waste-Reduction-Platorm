import React, { useEffect, useState } from 'react';

const BrowseSurplus = () => {
    const [surplusItems, setSurplusItems] = useState([]);

    useEffect(() => {
        fetch('http://localhost:8080/food-items/list')
            .then(response => response.json())
            .then(data => setSurplusItems(data));
    }, []);

    return (
        <div>
            <h2>Surplus Food Items</h2>
            {surplusItems.map(item => (
                <div key={item.id}>
                    <h3>{item.name}</h3>
                    <p>Quantity: {item.quantity}</p>
                    <p>Expiration Date: {item.expirationDate}</p>
                </div>
            ))}
        </div>
    );
};

export default BrowseSurplus;
