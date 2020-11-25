try {
   db.people.replaceOne({ "city" : "Moskow" },
      { "city" : "Moskwa"},
      {upsert:true}
   );
} catch (e){
   print(e);
}
