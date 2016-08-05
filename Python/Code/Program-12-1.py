Write_text = '''\
Programming is fun
When the work is done
if you wanna make your work also fun:
	use Python!
'''

f = open(`Write_text.txt', `w') # open for 'w'riting
f.write(Write_text) # write text to file
f.close() # close the file
