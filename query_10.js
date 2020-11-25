try{
      db.people.deleteMany({"email":1,"job":"Editor"})
    }catch(e)
        {print(e)
 }