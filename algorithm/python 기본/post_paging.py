def postPagiing(post, num):
  if post % num == 0:
    return post // num
  else:
    return (post // num) + 1 
