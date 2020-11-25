db.people.find({"first_name":"1","last_name":"2","birth_date": {"$gte": ISODate("2001-01-01T12:12:12.111Z"),"$lt": ISODate("2000-01-01T12:12:12.111Z"),}})

